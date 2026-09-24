package com.fyber.inneractive.sdk.click;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.fyber.inneractive.sdk.network.C8435z0;
import com.fyber.inneractive.sdk.util.AbstractC9154h0;
import com.fyber.inneractive.sdk.util.C9167l1;
import com.fyber.inneractive.sdk.util.EnumC9164k1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.click.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C7930d extends AbstractC7927a {

    /* JADX INFO: renamed from: a */
    public boolean f17615a = false;

    @Override // com.fyber.inneractive.sdk.click.AbstractC7927a
    /* JADX INFO: renamed from: a */
    public final C7928b mo20365a(Context context, Uri uri, List list) {
        Uri uri2;
        Uri uri3;
        Uri uri4;
        if (!mo20367a(uri, (C7944r) null)) {
            return null;
        }
        PriorityQueue priorityQueue = new PriorityQueue();
        String queryParameter = uri.getQueryParameter("primaryUrl");
        List<String> queryParameters = uri.getQueryParameters("primaryTrackingUrl");
        EnumC9164k1 enumC9164k1 = EnumC9164k1.Primary;
        try {
            uri2 = Uri.parse(queryParameter);
        } catch (Exception unused) {
            uri2 = null;
        }
        if (uri2 != null) {
            priorityQueue.offer(new C9167l1(enumC9164k1, uri2, queryParameters));
        }
        String queryParameter2 = uri.getQueryParameter("fallbackUrl");
        List<String> queryParameters2 = uri.getQueryParameters("fallbackTrackingUrl");
        EnumC9164k1 enumC9164k2 = EnumC9164k1.FallBack;
        try {
            uri3 = Uri.parse(queryParameter2);
        } catch (Exception unused2) {
            uri3 = null;
        }
        if (uri3 != null) {
            priorityQueue.offer(new C9167l1(enumC9164k2, uri3, queryParameters2));
        }
        if (priorityQueue.size() <= 0) {
            String string = uri.toString();
            EnumC7943q enumC7943q = EnumC7943q.DEEP_LINK;
            if (list != null) {
                list.add(new C7936j(string, false, enumC7943q, null));
            }
            return C7944r.m20369a(uri.toString(), "FyberDeepLink", "fyberDeepLink is not valid");
        }
        do {
            C9167l1 c9167l1 = (C9167l1) priorityQueue.poll();
            if (c9167l1 == null) {
                uri4 = null;
                break;
            }
            uri4 = c9167l1.f21463b;
            String scheme = uri4.getScheme();
            EnumC7943q enumC7943qM20364a = AbstractC7927a.m20364a(uri4, (TextUtils.isEmpty(scheme) || !scheme.toLowerCase(Locale.US).startsWith(ProxyConfig.MATCH_HTTP)) ? EnumC7943q.OPEN_IN_EXTERNAL_APPLICATION : EnumC7943q.OPENED_IN_EXTERNAL_BROWSER);
            boolean zM21965a = AbstractC9154h0.m21965a(context, new Intent("android.intent.action.VIEW", uri4));
            String string2 = uri4.toString();
            if (list != null) {
                list.add(new C7936j(string2, zM21965a, enumC7943qM20364a, null));
            }
            if (zM21965a) {
                for (String str : c9167l1.f21464c) {
                    if (!TextUtils.isEmpty(str)) {
                        IAlog.m21948d("%s %s", "SMART_LINK", str);
                        C8435z0.m20813b(str);
                    }
                }
            }
            if (!zM21965a) {
                uri4 = null;
            }
        } while (uri4 == null);
        return uri4 != null ? new C7928b(uri.toString(), AbstractC7927a.m20364a(uri4, EnumC7943q.OPEN_IN_EXTERNAL_APPLICATION), "FyberDeepLink", null) : C7944r.m20369a(uri.toString(), "FyberDeepLink", "tryHandleDeepLinkWithExternalApp has failed");
    }

    @Override // com.fyber.inneractive.sdk.click.AbstractC7927a
    /* JADX INFO: renamed from: a */
    public final void mo20366a() {
        this.f17615a = true;
    }

    @Override // com.fyber.inneractive.sdk.click.AbstractC7927a
    /* JADX INFO: renamed from: a */
    public final boolean mo20367a(Uri uri, C7944r c7944r) {
        return "smartlink".equalsIgnoreCase(uri.getScheme()) && !this.f17615a;
    }
}
