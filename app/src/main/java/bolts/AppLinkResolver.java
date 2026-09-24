package bolts;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public interface AppLinkResolver {
    Task<AppLink> getAppLinkFromUrlInBackground(Uri uri);
}
