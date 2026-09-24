package com.fyber.inneractive.sdk.flow.endcard;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.AbstractC9195v;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.w */
/* JADX INFO: loaded from: classes4.dex */
public final class C8117w extends AbstractC8083a {

    /* JADX INFO: renamed from: c */
    public Bitmap f18060c;

    /* JADX INFO: renamed from: d */
    public final ImageView f18061d;

    /* JADX INFO: renamed from: e */
    public final ViewGroup f18062e;

    public C8117w(C8116v c8116v) {
        super(c8116v);
        ImageView imageView = new ImageView(IAConfigManager.f17654M.f17689u.m20436a());
        imageView.setId(C7809R.id.ia_inneractive_vast_endcard_static);
        this.f18061d = imageView;
        this.f18062e = AbstractC8083a.m20498a(imageView);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.InterfaceC8108n
    /* JADX INFO: renamed from: b */
    public final View mo20506b() {
        return this.f18062e;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8083a, com.fyber.inneractive.sdk.flow.endcard.InterfaceC8108n
    public final void destroy() {
        AbstractC9195v.m22027a(mo20506b());
        Bitmap bitmap = this.f18060c;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f18060c = null;
        this.f18061d.setImageBitmap(null);
    }
}
