package com.fyber.inneractive.sdk.click;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InternalStoreWebpageActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.ignite.C8247g;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.network.C8381h1;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.C9142d0;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import com.fyber.inneractive.sdk.util.EnumC9151g0;
import com.fyber.inneractive.sdk.web.C9270v0;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.click.g */
/* JADX INFO: loaded from: classes4.dex */
public final class C7933g extends AbstractC7927a {

    /* JADX INFO: renamed from: a */
    public C9270v0 f17619a;

    /* JADX INFO: renamed from: b */
    public boolean f17620b;

    /* JADX INFO: renamed from: c */
    public InterfaceC7932f f17621c;

    /* JADX INFO: renamed from: d */
    public final C9152g1 f17622d;

    /* JADX INFO: renamed from: e */
    public final EnumC9150g f17623e;

    /* JADX INFO: renamed from: f */
    public boolean f17624f = false;

    public C7933g(InterfaceC7932f interfaceC7932f, C9152g1 c9152g1, EnumC9150g enumC9150g) {
        this.f17621c = interfaceC7932f;
        this.f17622d = c9152g1;
        this.f17623e = enumC9150g;
    }

    @Override // com.fyber.inneractive.sdk.click.AbstractC7927a
    /* JADX INFO: renamed from: a */
    public final C7928b mo20365a(Context context, Uri uri, List list) {
        PackageInfo packageInfo;
        C9142d0 c9142d0;
        C9270v0 c9270v0 = this.f17619a;
        if (c9270v0 == null) {
            return C7944r.m20369a(uri.toString(), "IgniteGooglePlay", "mInternalStoreWebpageController is null");
        }
        boolean z = this.f17620b;
        if (c9270v0.f21674C) {
            EnumC9151g0 enumC9151g0 = EnumC9151g0.FAILED;
            IllegalStateException illegalStateException = new IllegalStateException("Store controller is already open");
            context.getClass();
            c9142d0 = new C9142d0(enumC9151g0, illegalStateException);
        } else {
            c9270v0.f21674C = true;
            try {
                context.getClass();
            } catch (Throwable unused) {
            }
            c9270v0.f21675D = true;
            if (c9270v0.f21686j.equals("invalid_task_id") && !c9270v0.f21702z) {
                c9270v0.f21680d = z ? EnumC8253m.TRUE_SINGLE_TAP : EnumC8253m.SINGLE_TAP;
            }
            c9270v0.f21673B = z;
            if (c9270v0.f21672A) {
                c9270v0.m22091d("onInstallationSuccess();");
            } else if (!c9270v0.f21702z) {
                String str = c9270v0.f21679c;
                try {
                    packageInfo = !TextUtils.isEmpty(str) ? AbstractC9174o.f21470a.getPackageManager().getPackageInfo(str, 0) : null;
                } catch (Exception unused2) {
                }
                if (packageInfo != null) {
                    c9270v0.m22091d("onInstallationSuccess();");
                } else if (z) {
                    c9270v0.f21678b.m20648a(c9270v0.f21679c, new C8247g(c9270v0.f21682f, c9270v0.f21680d, c9270v0.f21684h.f18326a));
                    c9270v0.m22091d("onShowInstallStarted();");
                }
            }
            try {
                InternalStoreWebpageActivity.startActivity(context, c9270v0.f21681e);
                c9142d0 = new C9142d0(EnumC9151g0.OPENED_INTERNAL_STORE, null);
            } catch (ActivityNotFoundException e) {
                c9142d0 = new C9142d0(EnumC9151g0.FAILED, e);
            }
        }
        Throwable th = c9142d0.f21444b;
        if (th == null) {
            IAConfigManager.f17654M.f17686r.m20768a(new C8381h1(new C7931e(this, list, uri), uri.toString()));
            return new C7928b(uri.toString(), EnumC7943q.OPEN_INTERNAL_STORE, "IgniteGooglePlay", null);
        }
        if (list != null) {
            list.add(new C7936j(this.f17619a.f21687k, false, EnumC7943q.OPEN_INTERNAL_STORE, th.toString()));
        }
        return C7944r.m20369a(uri.toString(), "IgniteGooglePlay", "mInternalStoreWebpageController.show has failed");
    }

    @Override // com.fyber.inneractive.sdk.click.AbstractC7927a
    /* JADX INFO: renamed from: a */
    public final void mo20366a() {
        this.f17624f = true;
        this.f17621c = null;
    }

    @Override // com.fyber.inneractive.sdk.click.AbstractC7927a
    /* JADX INFO: renamed from: a */
    public final boolean mo20367a(Uri uri, C7944r c7944r) {
        EnumC8253m enumC8253m;
        C9270v0 c9270v0;
        EnumC8253m enumC8253m2 = EnumC8253m.NONE;
        if (c7944r != null) {
            enumC8253m = c7944r.f17652m;
            this.f17620b = c7944r.f17651l;
            this.f17619a = c7944r.f17650k;
        } else {
            enumC8253m = enumC8253m2;
        }
        return enumC8253m != enumC8253m2 && IAConfigManager.f17654M.f17660D.m20650n() && (c9270v0 = this.f17619a) != null && c9270v0.f21688l;
    }
}
