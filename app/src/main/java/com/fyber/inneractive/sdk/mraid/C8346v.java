package com.fyber.inneractive.sdk.mraid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Environment;
import com.facebook.share.internal.ShareConstants;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.network.C8361b1;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.AbstractC9239i0;
import com.fyber.inneractive.sdk.web.C9273x;
import com.fyber.inneractive.sdk.web.DialogInterfaceOnClickListenerC9275y;
import com.fyber.inneractive.sdk.web.RunnableC9269v;
import java.io.File;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.mraid.v */
/* JADX INFO: loaded from: classes4.dex */
public final class C8346v extends AbstractC8326e {
    public C8346v(LinkedHashMap linkedHashMap, AbstractC9239i0 abstractC9239i0, C9152g1 c9152g1) {
        super(linkedHashMap, abstractC9239i0, c9152g1);
    }

    @Override // com.fyber.inneractive.sdk.mraid.AbstractC8328f
    /* JADX INFO: renamed from: a */
    public final void mo20721a() {
        String str = (String) this.f18601b.get(ShareConstants.MEDIA_URI);
        if (str != null) {
            String externalStorageState = "";
            if (!"".equals(str)) {
                AbstractC9239i0 abstractC9239i0 = this.f18602c;
                Context contextM21989a = AbstractC9174o.m21989a(abstractC9239i0.f21565b);
                try {
                    externalStorageState = Environment.getExternalStorageState();
                } catch (Throwable unused) {
                }
                if (!"mounted".equals(externalStorageState) || AbstractC9174o.f21470a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    abstractC9239i0.m22071a(EnumC8335k.STORE_PICTURE, "Error downloading file - the device does not have an SD card mounted, or the Android permission is not granted.");
                    IAlog.m21945a("Error downloading file. Please check if the Android permission is not granted, or maybe the device does not have an SD card mounted? ", new Object[0]);
                    return;
                }
                if (contextM21989a instanceof Activity) {
                    new AlertDialog.Builder(AbstractC9174o.m21989a(abstractC9239i0.f21565b)).setTitle("Save Image").setMessage("Download image to Picture gallery?").setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).setPositiveButton("Okay", new DialogInterfaceOnClickListenerC9275y(abstractC9239i0, str)).setCancelable(true).show();
                    return;
                }
                AbstractC9183r.f21478b.post(new RunnableC9269v("Downloading image to Picture gallery..."));
                new File(Environment.getExternalStorageDirectory(), "Pictures").mkdirs();
                AbstractC8236x abstractC8236x = abstractC9239i0.f21582s;
                IAConfigManager.f17654M.f17686r.m20768a(new C8361b1(new C9273x(abstractC9239i0), str, abstractC8236x != null ? abstractC8236x.f18375c : null));
                return;
            }
        }
        this.f18602c.m22071a(EnumC8335k.STORE_PICTURE, "Image can't be stored with null or empty URL");
        IAlog.m21945a("Mraid Store Picture -Invalid URI ", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.mraid.AbstractC8326e
    /* JADX INFO: renamed from: c */
    public final String mo20718c() {
        return (String) this.f18601b.get(ShareConstants.MEDIA_URI);
    }
}
