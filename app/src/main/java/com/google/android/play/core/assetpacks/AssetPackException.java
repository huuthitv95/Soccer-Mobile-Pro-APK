package com.google.android.play.core.assetpacks;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.assetpacks.model.C10132a;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public class AssetPackException extends ApiException {
    AssetPackException(int i) {
        super(new Status(i, String.format(Locale.getDefault(), "Asset Pack Download Error(%d): %s", Integer.valueOf(i), C10132a.m22789a(i))));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    public int getErrorCode() {
        return -5;
    }
}
