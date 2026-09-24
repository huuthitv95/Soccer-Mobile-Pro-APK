package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.fyber.inneractive.sdk.util.AbstractC9154h0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.net.URISyntaxException;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.click.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C7934h extends AbstractC7927a {

    /* JADX INFO: renamed from: a */
    public boolean f17625a = false;

    @Override // com.fyber.inneractive.sdk.click.AbstractC7927a
    /* JADX INFO: renamed from: a */
    public final C7928b mo20365a(Context context, Uri uri, List list) {
        if (mo20367a(uri, (C7944r) null)) {
            try {
                Intent uri2 = Intent.parseUri(uri.toString(), 1);
                if (!this.f17625a && AbstractC9154h0.m21965a(context, uri2)) {
                    int i = IAlog.f21426a;
                    IAlog.m21948d("%s %s", "DEEPLINK", uri.toString());
                    if (list != null) {
                        list.add(new C7936j(uri.toString(), true, EnumC7943q.OPEN_IN_EXTERNAL_APPLICATION, null));
                    }
                    return new C7928b(uri.toString(), AbstractC7927a.m20364a(uri, EnumC7943q.OPEN_IN_EXTERNAL_APPLICATION), "IntentScheme", null);
                }
                String stringExtra = uri2.getStringExtra("browser_fallback_url");
                if (this.f17625a || TextUtils.isEmpty(stringExtra)) {
                    if (list != null) {
                        list.add(new C7936j(uri.toString(), false, EnumC7943q.OPEN_IN_EXTERNAL_APPLICATION, "tryToOpenExternalApp has failed (intent scheme)"));
                    }
                    return C7944r.m20369a(uri.toString(), "IntentScheme", "tryToOpenExternalApp has failed (intent scheme)");
                }
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra));
                    if (!(context instanceof Activity)) {
                        intent.setFlags(268435456);
                    }
                    context.startActivity(intent);
                    IAlog.m21948d("%s %s", "Intent opened successfully, url:", stringExtra);
                    if (list != null) {
                        list.add(new C7936j(uri.toString(), false, EnumC7943q.DEEP_LINK, null));
                        list.add(new C7936j(stringExtra, true, EnumC7943q.OPEN_IN_EXTERNAL_APPLICATION, null));
                    }
                    return new C7928b(uri.toString(), AbstractC7927a.m20364a(uri, EnumC7943q.OPEN_IN_EXTERNAL_APPLICATION), "IntentScheme", null);
                } catch (Throwable unused) {
                    IAlog.m21948d("%s %s", "Intent failed, url:", stringExtra);
                }
            } catch (URISyntaxException e) {
                IAlog.m21945a("failed parsing uri with error: %s", e.getLocalizedMessage());
                if (list != null) {
                    list.add(new C7936j(uri.toString(), false, EnumC7943q.OPEN_IN_EXTERNAL_APPLICATION, null));
                }
                return new C7928b(uri.toString(), EnumC7943q.FAILED, "IntentScheme", e);
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.click.AbstractC7927a
    /* JADX INFO: renamed from: a */
    public final void mo20366a() {
        this.f17625a = true;
    }

    @Override // com.fyber.inneractive.sdk.click.AbstractC7927a
    /* JADX INFO: renamed from: a */
    public final boolean mo20367a(Uri uri, C7944r c7944r) {
        return SDKConstants.PARAM_INTENT.equalsIgnoreCase(uri.getScheme()) && !this.f17625a;
    }
}
