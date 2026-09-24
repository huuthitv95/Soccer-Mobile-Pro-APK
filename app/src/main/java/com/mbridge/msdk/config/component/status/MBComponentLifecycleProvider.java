package com.mbridge.msdk.config.component.status;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.mbridge.msdk.foundation.controller.AbstractC13003a;

/* JADX INFO: loaded from: classes5.dex */
public class MBComponentLifecycleProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return "";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        try {
            if (AbstractC13003a.f35477s != null) {
                return true;
            }
            AbstractC13003a.f35477s = new C12839b(getContext());
            return true;
        } catch (Throwable th) {
            Log.e("MBLifecycleProvider", th.getMessage());
            return true;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
