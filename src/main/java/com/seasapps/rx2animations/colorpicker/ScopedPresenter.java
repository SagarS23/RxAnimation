package com.seasapps.rx2animations.colorpicker;

public interface ScopedPresenter<T extends BaseView> {

    void bind(T view);

    void unbind();
}
