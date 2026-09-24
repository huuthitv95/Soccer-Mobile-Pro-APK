package com.unity3d.services.core.configuration;

import com.facebook.share.internal.ShareConstants;

/* JADX INFO: loaded from: classes7.dex */
public enum InitRequestType {
    PRIVACY(ShareConstants.WEB_DIALOG_PARAM_PRIVACY),
    TOKEN("token_srr");

    private String _callType;

    InitRequestType(String str) {
        this._callType = str;
    }

    public String getCallType() {
        return this._callType;
    }
}
