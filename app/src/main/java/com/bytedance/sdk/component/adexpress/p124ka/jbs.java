package com.bytedance.sdk.component.adexpress.p124ka;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class jbs {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.ka.jbs$ri */
    public enum EnumC2494ri {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*");


        /* JADX INFO: renamed from: fi */
        private String f6877fi;

        EnumC2494ri(String str) {
            this.f6877fi = str;
        }

        /* JADX INFO: renamed from: ri */
        public String m8818ri() {
            return this.f6877fi;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static EnumC2494ri m8817ri(String str) {
        EnumC2494ri enumC2494ri = EnumC2494ri.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        return EnumC2494ri.CSS;
                    }
                    if (path.endsWith(".js")) {
                        return EnumC2494ri.JS;
                    }
                    if (!path.endsWith(".jpg") && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp") && !path.endsWith(".ico")) {
                        if (path.endsWith(".html")) {
                            return EnumC2494ri.HTML;
                        }
                    }
                    return EnumC2494ri.IMAGE;
                }
            } catch (Throwable unused) {
            }
        }
        return enumC2494ri;
    }
}
