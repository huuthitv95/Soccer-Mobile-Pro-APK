package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AssetPackStates {
    /* JADX INFO: renamed from: a */
    public static AssetPackStates m22478a(Bundle bundle, C10017co c10017co, C10057ea c10057ea, InterfaceC9980be interfaceC9980be) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap map = new HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            map.put(str, AssetPackState.m22477b(bundle, str, c10017co, c10057ea, interfaceC9980be));
        }
        return new C9990bo(bundle.getLong("total_bytes_to_download"), map);
    }

    public abstract Map<String, AssetPackState> packStates();

    public abstract long totalBytes();
}
