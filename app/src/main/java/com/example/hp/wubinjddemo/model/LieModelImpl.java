package com.example.hp.wubinjddemo.model;

import com.example.hp.wubinjddemo.bean.LieBean;
import com.example.hp.wubinjddemo.http.lie.LieRetrofit;
import com.example.hp.wubinjddemo.http.lie.LieService;
import com.example.hp.wubinjddemo.presenter.LiePresenter;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class LieModelImpl implements LieModel {
    private LiePresenter liePresenter;
    public LieModelImpl(LiePresenter liePresenter){
        this.liePresenter=liePresenter;
    }
    @Override
    public void getLieGoodsList(Map<String, String> map) {
        LieRetrofit instence = LieRetrofit.getInstence();
        LieService instenceRequest = instence.createRequest(LieService.class);
        Observable<LieBean> observable = instenceRequest.getLie(map);
        observable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LieBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(LieBean value) {
                        String code = value.getCode();
                        if(code.equals("0")){
                            List<LieBean.DataBean> data = value.getData();
                            liePresenter.getLieDate(data);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
