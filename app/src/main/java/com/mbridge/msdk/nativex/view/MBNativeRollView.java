package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class MBNativeRollView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private RollingBCView f37295a;

    /* JADX INFO: renamed from: b */
    private Context f37296b;

    /* JADX INFO: renamed from: c */
    private NativeListener.FilpListener f37297c;

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.MBNativeRollView$a */
    public interface InterfaceC13425a {
    }

    public MBNativeRollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f37295a.dispatchTouchEvent(motionEvent);
    }

    public void setData(List<Frame> list, Context context, String str, InterfaceC13425a interfaceC13425a) {
        this.f37295a.setData(list, context, str, interfaceC13425a);
    }

    public void setFilpListening(NativeListener.FilpListener filpListener) {
        if (filpListener != null) {
            this.f37297c = filpListener;
            this.f37295a.setFilpListening(filpListener);
        }
    }

    public void setFrameWidth(int i) {
        this.f37295a.setLayoutParams(new LinearLayout.LayoutParams(i, -2));
    }

    public MBNativeRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37296b = context;
        RollingBCView rollingBCView = new RollingBCView(context);
        this.f37295a = rollingBCView;
        addView(rollingBCView);
        this.f37295a.setLayoutParams(new LinearLayout.LayoutParams((int) (((double) C13229v0.m37939j(context)) * 0.9d), -2));
        setClipChildren(false);
    }

    public MBNativeRollView(Context context) {
        this(context, null);
    }
}
