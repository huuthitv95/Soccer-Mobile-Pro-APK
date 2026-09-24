package com.ironsource.mediationsdk.ads.nativead.interfaces;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public interface NativeAdDataInterface {

    public static class Image {

        /* JADX INFO: renamed from: a */
        private final Drawable f31009a;

        /* JADX INFO: renamed from: b */
        private final Uri f31010b;

        public Image(Drawable drawable, Uri uri) {
            this.f31009a = drawable;
            this.f31010b = uri;
        }

        public final Drawable getDrawable() {
            return this.f31009a;
        }

        public final Uri getUri() {
            return this.f31010b;
        }
    }

    String getAdvertiser();

    String getBody();

    String getCallToAction();

    Image getIcon();

    String getTitle();
}
