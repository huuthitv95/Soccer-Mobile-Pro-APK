package com.fyber.inneractive.sdk.flow.endcard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.a */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8083a implements InterfaceC8108n {

    /* JADX INFO: renamed from: a */
    public final String f17980a = IAlog.m21943a(this);

    /* JADX INFO: renamed from: b */
    public final AbstractC8084b f17981b;

    public AbstractC8083a(AbstractC8084b abstractC8084b) {
        this.f17981b = abstractC8084b;
    }

    /* JADX INFO: renamed from: a */
    public static ViewGroup m20498a(View view) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(view.getContext()).inflate(C7809R.layout.ia_endcard_container, (ViewGroup) null);
        viewGroup.addView(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
        return viewGroup;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.InterfaceC8108n
    /* JADX INFO: renamed from: a */
    public void mo20499a() {
        AbstractC9195v.m22027a(mo20506b());
    }

    /* JADX INFO: renamed from: c */
    public void mo20500c() {
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.InterfaceC8108n
    public void destroy() {
        mo20499a();
    }
}
