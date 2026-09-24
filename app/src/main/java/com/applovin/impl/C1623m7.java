package com.applovin.impl;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.m7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1623m7 {

    /* JADX INFO: renamed from: a */
    private final Intent f2071a = new Intent();

    /* JADX INFO: renamed from: a */
    public Intent m3229a() {
        return this.f2071a;
    }

    /* JADX INFO: renamed from: a */
    public C1623m7 m3230a(String str) {
        if (StringUtils.isValidString(str)) {
            for (String str2 : str.split(",")) {
                this.f2071a.addCategory(str2);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C1623m7 m3231a(String str, String str2) {
        boolean zIsValidString = StringUtils.isValidString(str);
        boolean zIsValidString2 = StringUtils.isValidString(str2);
        if (zIsValidString && zIsValidString2) {
            this.f2071a.setDataAndType(Uri.parse(str), str2);
            return this;
        }
        if (zIsValidString) {
            this.f2071a.setData(Uri.parse(str));
            return this;
        }
        if (zIsValidString2) {
            this.f2071a.setType(str2);
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C1623m7 m3232a(String str, String str2, String str3) {
        if (StringUtils.isValidString(str)) {
            Uri uri = Uri.parse(str);
            this.f2071a.setClipData(StringUtils.isValidString(str2) ? new ClipData(new ClipDescription(StringUtils.emptyIfNull(str3), new String[]{str2}), new ClipData.Item(uri)) : ClipData.newRawUri(StringUtils.emptyIfNull(str3), uri));
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C1623m7 m3233b(String str) {
        if (StringUtils.isValidString(str)) {
            this.f2071a.addFlags(Integer.parseInt(str));
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C1623m7 m3234b(String str, String str2, String str3) {
        if (StringUtils.isValidString(str)) {
            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
            if (componentNameUnflattenFromString != null) {
                this.f2071a.setComponent(componentNameUnflattenFromString);
                return this;
            }
        } else {
            if (StringUtils.isValidString(str2) && StringUtils.isValidString(str3)) {
                this.f2071a.setClassName(str3, str2);
                return this;
            }
            if (StringUtils.isValidString(str3)) {
                this.f2071a.setPackage(str3);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public Intent m3235c(String str) {
        Intent intentCreateChooser = Intent.createChooser(this.f2071a, StringUtils.emptyIfNull(str));
        intentCreateChooser.addFlags(this.f2071a.getFlags());
        return intentCreateChooser;
    }

    /* JADX INFO: renamed from: d */
    public C1623m7 m3236d(String str) {
        if (StringUtils.isValidString(str)) {
            this.f2071a.setAction(str);
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C1623m7 m3237e(String str) {
        if (StringUtils.isValidString(str)) {
            this.f2071a.putExtras(JsonUtils.toBundle(JsonUtils.jsonObjectFromJsonString(str, new JSONObject())));
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C1623m7 m3238f(String str) {
        if (StringUtils.isValidString(str) && AbstractC1677p0.m3813g()) {
            this.f2071a.setIdentifier(str);
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C1623m7 m3239g(String str) {
        if (StringUtils.isValidString(str)) {
            this.f2071a.setSelector(new Intent(str));
        }
        return this;
    }

    /* JADX INFO: renamed from: h */
    public C1623m7 m3240h(String str) {
        if (StringUtils.isValidString(str)) {
            String[] strArrSplit = str.split(",");
            if (strArrSplit.length == 4) {
                this.f2071a.setSourceBounds(new Rect(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), Integer.parseInt(strArrSplit[3])));
            }
        }
        return this;
    }
}
