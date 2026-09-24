package com.mbridge.msdk.out.strategy.base;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.out.BaseExtraInterfaceForHandler;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseAdHandler implements BaseExtraInterfaceForHandler {
    protected static final String TAG = "BaseAdHandler";
    protected Context context;
    protected String placementId;
    protected String unitId;

    public BaseAdHandler(Context context, String str, String str2) {
        this.context = context;
        this.placementId = str;
        this.unitId = str2;
        if (C13008c.m36588n().m36542d() == null && context != null) {
            C13008c.m36588n().m36535b(context);
        }
        if (context instanceof Activity) {
            C13008c.m36588n().m36527a(context);
        }
        initData(str, str2);
    }

    private void initData(String str, String str2) {
        initStrategy(str2, str);
        String strM37926e = C13229v0.m37926e(str2);
        if (TextUtils.isEmpty(strM37926e)) {
            return;
        }
        C13229v0.m37922d(str2, strM37926e);
    }

    public Context getContext() {
        return this.context;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public String getUnitId() {
        return this.unitId;
    }

    protected abstract void initStrategy(String str, String str2);

    public BaseAdHandler(String str, String str2) {
        this.placementId = str;
        this.unitId = str2;
        initData(str, str2);
    }
}
