package com.mouad.task_app;

public interface EditorView {
    void showProgress();
    void hideProgress();
    void onRequestError(String message);
    void onRequestSuccess(String message);
}
