package com.mbridge.msdk.dycreator.viewmodel;

import com.mbridge.msdk.dycreator.viewobserver.C12990c;
import com.mbridge.msdk.dycreator.viewobserver.C12991d;
import com.mbridge.msdk.dycreator.viewobserver.C12993f;
import com.mbridge.msdk.dycreator.viewobserver.C12995h;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;

/* JADX INFO: loaded from: classes5.dex */
public interface BaseViewModel {
    void setClickSubject(C12990c c12990c);

    void setConcreteSubject(C12991d c12991d);

    void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener);

    void setEffectSubject(C12993f c12993f);

    void setModelDataAndBind();

    void setReportSubject(C12995h c12995h);
}
