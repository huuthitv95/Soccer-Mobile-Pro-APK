package com.facebook.bolts;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public interface AppLinkResolver {
    Task<AppLink> getAppLinkFromUrlInBackground(Uri uri);
}
