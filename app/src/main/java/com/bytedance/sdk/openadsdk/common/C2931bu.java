package com.bytedance.sdk.openadsdk.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.p235ik.C3386qt;
import com.bytedance.sdk.openadsdk.p235ik.DialogC3374co;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.bu */
/* JADX INFO: loaded from: classes3.dex */
public class C2931bu extends C3192ik implements C3386qt.lr {

    /* JADX INFO: renamed from: di */
    private boolean f8771di;

    /* JADX INFO: renamed from: fi */
    private String f8772fi;

    /* JADX INFO: renamed from: ik */
    private ri f8773ik;

    /* JADX INFO: renamed from: ka */
    private Context f8774ka;

    /* JADX INFO: renamed from: lr */
    private wjv f8775lr;

    /* JADX INFO: renamed from: ri */
    private View f8776ri;
    private final C3386qt xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.bu$ri */
    public interface ri {
        /* JADX INFO: renamed from: lr */
        void mo10546lr(View view);

        /* JADX INFO: renamed from: ri */
        void mo10547ri(View view);

        /* JADX INFO: renamed from: ri */
        void mo10548ri(FilterWord filterWord);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2931bu(Context context) {
        this(context, (AttributeSet) null);
    }

    public C2931bu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2931bu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8771di = false;
        this.xha = new C3386qt();
        m11271ri(context, attributeSet);
    }

    public C2931bu(Context context, wjv wjvVar) {
        this(context.getApplicationContext());
        this.f8775lr = wjvVar;
        this.f8774ka = context;
        m11269ka();
        m11268fi();
    }

    /* JADX INFO: renamed from: di */
    private DialogC3374co.ri m11267di() {
        return new DialogC3374co.ri() { // from class: com.bytedance.sdk.openadsdk.common.bu.2
            @Override // com.bytedance.sdk.openadsdk.p235ik.DialogC3374co.ri
            /* JADX INFO: renamed from: ik */
            public void mo11276ik() {
                C2931bu.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.p235ik.DialogC3374co.ri
            /* JADX INFO: renamed from: lr */
            public void mo11277lr() {
                C2931bu.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.p235ik.DialogC3374co.ri
            /* JADX INFO: renamed from: ri */
            public void mo11278ri() {
                C2931bu.this.setVisibility(8);
            }

            @Override // com.bytedance.sdk.openadsdk.p235ik.DialogC3374co.ri
            /* JADX INFO: renamed from: ri */
            public void mo11279ri(int i, FilterWord filterWord, String str) {
                C2931bu.this.xha.m15320ik(str);
                C2931bu.this.setVisibility(0);
            }
        };
    }

    /* JADX INFO: renamed from: fi */
    private void m11268fi() {
        C3386qt c3386qt;
        wjv wjvVar = this.f8775lr;
        if (wjvVar == null || (c3386qt = this.xha) == null) {
            return;
        }
        c3386qt.m15335ri(wjvVar.m14409ib());
    }

    /* JADX INFO: renamed from: ka */
    private void m11269ka() {
        this.xha.m15334ri(this.f8775lr.yjg());
        this.xha.m15332ri(this);
    }

    /* JADX INFO: renamed from: ri */
    private void m11271ri(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.bu.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C2931bu.this.xha != null) {
                    C2931bu.this.xha.m15319fi();
                } else {
                    C2931bu.this.m11273lr();
                }
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.f8776ri = new com.bytedance.sdk.openadsdk.p235ik.jbs(context, this.xha);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = C3583qd.m16589lr(getContext(), 20.0f);
        layoutParams.rightMargin = C3583qd.m16589lr(getContext(), 20.0f);
        this.f8776ri.setLayoutParams(layoutParams);
        this.f8776ri.setClickable(true);
        m11268fi();
    }

    /* JADX INFO: renamed from: ik */
    public void m11272ik() {
        Context context = this.f8774ka;
        if (context instanceof Activity) {
            boolean zIsFinishing = ((Activity) context).isFinishing();
            DialogC3374co dialogC3374co = new DialogC3374co(this.f8774ka, this.xha);
            dialogC3374co.m15274ri(m11267di());
            dialogC3374co.m15273ri(this.f8775lr);
            if (zIsFinishing || dialogC3374co.isShowing()) {
                return;
            }
            dialogC3374co.show();
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m11273lr() {
        setVisibility(8);
        this.f8771di = false;
        ri riVar = this.f8773ik;
        if (riVar != null) {
            riVar.mo10546lr(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C3386qt c3386qt = this.xha;
        if (c3386qt != null) {
            c3386qt.m15326ri();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11274ri() {
        if (this.f8776ri.getParent() == null) {
            addView(this.f8776ri);
        }
        setVisibility(0);
        this.f8771di = true;
        ri riVar = this.f8773ik;
        if (riVar != null) {
            riVar.mo10547ri(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p235ik.C3386qt.lr
    /* JADX INFO: renamed from: ri */
    public void mo11275ri(int i) {
        if (C3386qt.f12041lr != i) {
            if (C3386qt.f12039ik == i) {
                m11273lr();
                return;
            } else {
                if (C3386qt.f12038fi == i) {
                    m11272ik();
                    return;
                }
                return;
            }
        }
        FilterWord filterWordM15323lr = this.xha.m15323lr();
        if (filterWordM15323lr == null || C3386qt.f12042ri.equals(filterWordM15323lr)) {
            return;
        }
        ri riVar = this.f8773ik;
        if (riVar != null) {
            try {
                riVar.mo10548ri(filterWordM15323lr);
            } catch (Throwable unused) {
            }
        }
        m11273lr();
    }

    public void setCallback(ri riVar) {
        this.f8773ik = riVar;
    }

    public void setDislikeSource(String str) {
        this.f8772fi = str;
        this.xha.m15324lr(str);
    }
}
