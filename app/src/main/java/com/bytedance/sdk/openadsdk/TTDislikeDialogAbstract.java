package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.p235ik.C3386qt;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TTDislikeDialogAbstract extends Dialog implements C3386qt.lr {

    /* JADX INFO: renamed from: ik */
    protected final C3386qt f7916ik;

    /* JADX INFO: renamed from: ka */
    private View f7917ka;

    /* JADX INFO: renamed from: lr */
    protected List<FilterWord> f7918lr;

    /* JADX INFO: renamed from: ri */
    protected String f7919ri;

    public TTDislikeDialogAbstract(Context context) {
        super(context);
        C3386qt c3386qt = new C3386qt();
        this.f7916ik = c3386qt;
        c3386qt.m15332ri(this);
    }

    public TTDislikeDialogAbstract(Context context, int i) {
        super(context, i);
        C3386qt c3386qt = new C3386qt();
        this.f7916ik = c3386qt;
        c3386qt.m15332ri(this);
    }

    public void destroy() {
        C3386qt c3386qt = this.f7916ik;
        if (c3386qt != null) {
            c3386qt.m15326ri();
        }
    }

    public C3386qt getDislikeManager() {
        return this.f7916ik;
    }

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7917ka = getLayoutView();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        View view = this.f7917ka;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
    }

    public void onSuggestionSubmit(String str) {
        C3386qt c3386qt = this.f7916ik;
        if (c3386qt != null) {
            c3386qt.m15320ik(str);
        }
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.f7919ri = str;
        this.f7918lr = list;
        this.f7916ik.m15334ri(str);
        this.f7916ik.m15335ri(this.f7918lr);
    }
}
