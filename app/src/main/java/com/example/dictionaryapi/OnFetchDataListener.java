package com.example.dictionaryapi;

import com.example.dictionaryapi.Models.APIResponse;

public interface OnFetchDataListener {
    void onFeatchData(APIResponse apiResponse, String message);
    void onError(String message);
}
