package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.util.AbstractC9154h0;
import com.fyber.inneractive.sdk.util.C9142d0;
import com.fyber.inneractive.sdk.util.C9145e0;
import com.fyber.inneractive.sdk.util.EnumC9148f0;
import com.fyber.inneractive.sdk.util.EnumC9151g0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.click.i */
/* JADX INFO: loaded from: classes4.dex */
public final class C7935i extends AbstractC7927a {

    /* JADX INFO: renamed from: a */
    public final String f17626a;

    /* JADX INFO: renamed from: b */
    public final boolean f17627b;

    /* JADX INFO: renamed from: c */
    public boolean f17628c = false;

    public C7935i(boolean z, String str) {
        this.f17626a = str;
        this.f17627b = z;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    @Override // com.fyber.inneractive.sdk.click.AbstractC7927a
    /* JADX INFO: renamed from: a */
    public final C7928b mo20365a(Context context, Uri uri, List list) {
        String queryParameter;
        C9142d0 c9142d0;
        String string = uri.toString();
        if (TextUtils.isEmpty(string)) {
            queryParameter = null;
        } else {
            Uri uri2 = Uri.parse(string);
            String scheme = uri2.getScheme();
            String host = uri2.getHost();
            if (scheme == null || !scheme.equals("fybernativebrowser") || host == null || !host.equals("navigate")) {
                queryParameter = null;
            } else {
                queryParameter = uri2.getQueryParameter("url");
            }
        }
        if (queryParameter != null) {
            try {
                uri = Uri.parse(queryParameter);
            } catch (Exception unused) {
                IAlog.m21945a("IAJavaUtil: getValidUri: Invalid url %s", queryParameter);
                uri = null;
            }
            string = queryParameter;
        }
        if (this.f17628c) {
            return C7944r.m20369a(uri.toString(), null, "The process was cancelled");
        }
        EnumC9148f0 enumC9148f0 = EnumC9148f0.OPEN_EVERYTHING;
        try {
            context.getClass();
        } catch (Throwable unused2) {
        }
        try {
            IAlog.m21945a("IAJavaUtil - valid url found: '%s' opening browser", string);
            try {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
                    if (!(context instanceof Activity)) {
                        intent.setFlags(268435456);
                    }
                    context.startActivity(intent);
                    c9142d0 = new C9142d0(EnumC9151g0.OPEN_IN_EXTERNAL_BROWSER, null);
                } catch (ActivityNotFoundException unused3) {
                    c9142d0 = AbstractC9154h0.m21966a(context, string) ? new C9142d0(EnumC9151g0.OPENED_USING_CHROME_NAVIGATE, null) : new C9142d0(EnumC9151g0.FAILED, new C9145e0("tryOpeningChromeGracefully has failed and couldn't open the url"));
                }
            } catch (Throwable unused4) {
                if (AbstractC9154h0.m21968d(string) || AbstractC9154h0.m21967c(string) || enumC9148f0 == EnumC9148f0.DO_NOT_OPEN_IN_INTERNAL_BROWSER) {
                    c9142d0 = new C9142d0(EnumC9151g0.FAILED, new C9145e0("canOpenInExternalBrowser has decided it cant be opened and shouldUseInternalBrowser was set to true"));
                } else {
                    Intent intent2 = new Intent(context, (Class<?>) InneractiveInternalBrowserActivity.class);
                    intent2.putExtra("extra_url", string);
                    intent2.putExtra("spotId", (String) null);
                    if (!(context instanceof Activity)) {
                        intent2.setFlags(268435456);
                    }
                    context.startActivity(intent2);
                    c9142d0 = new C9142d0(EnumC9151g0.OPENED_IN_INTERNAL_BROWSER, null);
                }
            }
        } catch (Throwable th) {
            IAlog.m21945a("IAJavaUtil - could not open a browser for url: %s", string);
            c9142d0 = new C9142d0(EnumC9151g0.FAILED, th);
        }
        if (list != null) {
            Throwable th2 = c9142d0.f21444b;
            if (th2 != null) {
                list.add(new C7936j(string, false, null, th2.toString()));
            } else {
                list.add(new C7936j(string, true, AbstractC7927a.m20364a(uri, EnumC7943q.OPENED_IN_EXTERNAL_BROWSER), null));
            }
        }
        return new C7928b(uri.toString(), AbstractC7927a.m20364a(uri, EnumC7943q.OPENED_IN_EXTERNAL_BROWSER), "FyberNativeBrowser", null);
    }

    @Override // com.fyber.inneractive.sdk.click.AbstractC7927a
    /* JADX INFO: renamed from: a */
    public final void mo20366a() {
        this.f17628c = true;
    }

    @Override // com.fyber.inneractive.sdk.click.AbstractC7927a
    /* JADX INFO: renamed from: a */
    public final boolean mo20367a(Uri uri, C7944r c7944r) {
        if (this.f17628c) {
            return false;
        }
        return "fybernativebrowser".equalsIgnoreCase(uri.getScheme()) || "fybernativebrowser".equalsIgnoreCase(this.f17626a) || this.f17627b || uri.toString().contains("FYBER_OPEN_BROWSER");
    }
}
