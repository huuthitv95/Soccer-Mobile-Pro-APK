package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import androidx.webkit.ProxyConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.click.l */
/* JADX INFO: loaded from: classes4.dex */
public final class C7938l extends AbstractC7927a {

    /* JADX INFO: renamed from: b */
    public static final C7937k f17633b = new C7937k();

    /* JADX INFO: renamed from: a */
    public boolean f17634a = false;

    /* JADX INFO: renamed from: a */
    public final C7928b m20368a(Context context, Intent intent, Uri uri, List list) {
        if (this.f17634a) {
            return C7944r.m20369a(uri.toString(), "Resolver", "The process was cancelled");
        }
        try {
            context.startActivity(intent);
            if (list != null) {
                list.add(new C7936j(uri.toString(), true, AbstractC7927a.m20364a(intent.getData(), EnumC7943q.OPEN_IN_EXTERNAL_APPLICATION), null));
            }
            return new C7928b(uri.toString(), AbstractC7927a.m20364a(intent.getData(), EnumC7943q.OPEN_IN_EXTERNAL_APPLICATION), "Resolver", null);
        } catch (Throwable th) {
            IAlog.m21945a("failed starting activity with error: %s", th.getLocalizedMessage());
            if (list != null) {
                list.add(new C7936j(uri.toString(), false, EnumC7943q.OPEN_IN_EXTERNAL_APPLICATION, null));
            }
            return C7944r.m20369a(uri.toString(), "Resolver", "failed starting resolved activity - " + th.getMessage());
        }
    }

    @Override // com.fyber.inneractive.sdk.click.AbstractC7927a
    /* JADX INFO: renamed from: a */
    public final C7928b mo20365a(Context context, Uri uri, List list) {
        Intent intent;
        ResolveInfo resolveInfo;
        if (this.f17634a) {
            return null;
        }
        if (Build.VERSION.SDK_INT > 29) {
            String scheme = uri.getScheme();
            if (!ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                if (this.f17634a) {
                    return null;
                }
                Intent intent2 = new Intent("android.intent.action.VIEW", uri);
                if (!(context instanceof Activity)) {
                    intent2.setFlags(268435456);
                }
                return m20368a(context, intent2, uri, list);
            }
        }
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 32);
        if (listQueryIntentActivities != null && listQueryIntentActivities.size() > 0) {
            List<ResolveInfo> listQueryIntentActivities2 = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://www.fyber.com")), 32);
            TreeSet treeSet = new TreeSet(f17633b);
            treeSet.addAll(listQueryIntentActivities2);
            listQueryIntentActivities.removeAll(treeSet);
            if (listQueryIntentActivities.size() <= 0 || (resolveInfo = listQueryIntentActivities.get(0)) == null) {
                intent = null;
            } else {
                intent = new Intent("android.intent.action.VIEW", uri);
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
            }
            if (intent != null && !this.f17634a) {
                return m20368a(context, intent, uri, list);
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.click.AbstractC7927a
    /* JADX INFO: renamed from: a */
    public final void mo20366a() {
        this.f17634a = true;
    }

    @Override // com.fyber.inneractive.sdk.click.AbstractC7927a
    /* JADX INFO: renamed from: a */
    public final boolean mo20367a(Uri uri, C7944r c7944r) {
        return !this.f17634a;
    }
}
