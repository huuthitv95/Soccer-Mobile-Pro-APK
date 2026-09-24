package com.fyber.inneractive.sdk.click;

import android.content.Context;
import android.net.Uri;
import androidx.webkit.ProxyConfig;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.click.a */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7927a {
    /* JADX INFO: renamed from: a */
    public static EnumC7943q m20364a(Uri uri, EnumC7943q enumC7943q) {
        if (uri != null) {
            String host = uri.getHost();
            String scheme = uri.getScheme();
            if ("market".equalsIgnoreCase(scheme) || ((ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) && ("play.google.com".equalsIgnoreCase(host) || "market.android.com".equalsIgnoreCase(host)))) {
                return EnumC7943q.OPEN_GOOGLE_STORE;
            }
        }
        return enumC7943q;
    }

    /* JADX INFO: renamed from: a */
    public abstract C7928b mo20365a(Context context, Uri uri, List list);

    /* JADX INFO: renamed from: a */
    public abstract void mo20366a();

    /* JADX INFO: renamed from: a */
    public abstract boolean mo20367a(Uri uri, C7944r c7944r);
}
