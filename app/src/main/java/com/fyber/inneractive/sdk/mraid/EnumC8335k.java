package com.fyber.inneractive.sdk.mraid;

import com.vungle.ads.internal.presenter.MRAIDPresenter;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.mraid.k */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC8335k {
    CLOSE("close"),
    EXPAND("expand"),
    USECUSTOMCLOSE("usecustomclose"),
    OPEN("open"),
    RESIZE("resize"),
    GET_RESIZE_PROPERTIES("getResizeProperties"),
    SET_RESIZE_PROPERTIES("setResizeProperties"),
    SET_ORIENTATION_PROPERTIES(MRAIDPresenter.SET_ORIENTATION_PROPERTIES),
    PLAY_VIDEO("playVideo"),
    STORE_PICTURE("storePicture"),
    GET_CURRENT_POSITION("getCurrentPosition"),
    GET_DEFAULT_POSITION("getDefaultPosition"),
    GET_MAX_SIZE("getMaxSize"),
    GET_SCREEN_SIZE("getScreenSize"),
    CREATE_CALENDAR_EVENT("createCalendarEvent"),
    UNSPECIFIED("");

    private String mCommand;

    EnumC8335k(String str) {
        this.mCommand = str;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC8335k m20722a(String str) {
        for (EnumC8335k enumC8335k : values()) {
            if (enumC8335k.mCommand.equals(str)) {
                return enumC8335k;
            }
        }
        return UNSPECIFIED;
    }

    /* JADX INFO: renamed from: a */
    public final String m20723a() {
        return this.mCommand;
    }
}
