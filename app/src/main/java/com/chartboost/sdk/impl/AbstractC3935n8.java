package com.chartboost.sdk.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.n8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC3935n8 {
    /* JADX INFO: renamed from: a */
    public static final PackageInfo m18770a(PackageManager packageManager, String packageName, int i) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (Build.VERSION.SDK_INT >= 33) {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(i));
            Intrinsics.checkNotNull(packageInfo);
            return packageInfo;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(packageName, i);
        Intrinsics.checkNotNull(packageInfo2);
        return packageInfo2;
    }

    /* JADX INFO: renamed from: a */
    public static final C3850jf m18771a(C3769g3 c3769g3) {
        Intrinsics.checkNotNullParameter(c3769g3, "<this>");
        return new C3850jf(Integer.valueOf(c3769g3.m17753a()), Integer.valueOf(c3769g3.m17755c().m17619b()), c3769g3.m17754b(), c3769g3.m17758f());
    }

    /* JADX INFO: renamed from: a */
    public static final C3944nh m18772a(C3921mh c3921mh) {
        Intrinsics.checkNotNullParameter(c3921mh, "<this>");
        return new C3944nh(c3921mh.m18681a(), c3921mh.m18682b(), c3921mh.m18683c());
    }

    /* JADX INFO: renamed from: a */
    public static final String m18773a(PackageManager packageManager, String packageName) {
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            String str = AbstractC3912m8.getPackageInfoCompat(packageManager, packageName, 128).versionName;
            return str == null ? "" : str;
        } catch (Exception e) {
            C4048sb.m19410b("Exception raised getting package manager object", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static final List m18774a(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        IntRange intRangeUntil = RangesKt.until(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((IntIterator) it).nextInt()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final List m18775b(JSONArray jSONArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        IntRange intRangeUntil = RangesKt.until(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((IntIterator) it).nextInt());
            if (obj == null) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
