package com.mbridge.msdk.dycreator.error;

import androidx.media3.common.PlaybackException;

/* JADX INFO: renamed from: com.mbridge.msdk.dycreator.error.b */
/* JADX INFO: compiled from: FixedError.java */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC12975b {
    NOT_FOUND_VIEWOPTION(-101, "ViewOption is null"),
    NOT_FOUND_CONTEXT(PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED, "context is null"),
    FILE_CREATE_VIEW_FILE(PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED, "file create view is null"),
    CAMPAIGNEX_IS_NULL(PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT, "Campaign size only one"),
    NOT_FOUND_CAMPAIGN(PlaybackException.ERROR_CODE_PARENTAL_CONTROL_RESTRICTED, "campaign is null"),
    NOT_FOUND_DYNAMIC_FILE(PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION, "dynamic file is not exits"),
    BIND_DATA_FILE_OR_DIR(PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED, "data file or file dir is not exits "),
    NOT_FOUND_DYNAMIC_OPTION(PlaybackException.ERROR_CODE_SETUP_REQUIRED, "dynamic_option is not exits");


    /* JADX INFO: renamed from: a */
    private int f35366a;

    /* JADX INFO: renamed from: b */
    private String f35367b;

    EnumC12975b(int i, String str) {
        this.f35366a = i;
        this.f35367b = str;
    }

    /* JADX INFO: renamed from: g */
    public int m36377g() {
        return this.f35366a;
    }

    /* JADX INFO: renamed from: h */
    public String m36378h() {
        return this.f35367b;
    }
}
