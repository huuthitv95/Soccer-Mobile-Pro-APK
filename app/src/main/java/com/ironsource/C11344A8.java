package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.A8 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11344A8 extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private final String f23843a;

    /* JADX INFO: renamed from: b */
    private a f23844b;

    /* JADX INFO: renamed from: com.ironsource.A8$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo25294a(C12394ng c12394ng);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11344A8(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f23843a = "ISNNativeAdContainer";
    }

    /* JADX INFO: renamed from: a */
    private final C12394ng m25293a() {
        return new C12394ng(getVisibility() == 0, getWindowVisibility() == 0, isShown());
    }

    public final a getListener$mediationsdk_release() {
        return this.f23844b;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int i) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        Logger.m33642i(this.f23843a, "onVisibilityChanged: " + i);
        a aVar = this.f23844b;
        if (aVar != null) {
            aVar.mo25294a(m25293a());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        Logger.m33642i(this.f23843a, "onWindowVisibilityChanged: " + i);
        a aVar = this.f23844b;
        if (aVar != null) {
            aVar.mo25294a(m25293a());
        }
    }

    public final void setListener$mediationsdk_release(a aVar) {
        this.f23844b = aVar;
    }
}
