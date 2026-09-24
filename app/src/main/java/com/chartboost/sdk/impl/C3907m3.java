package com.chartboost.sdk.impl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.m3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3907m3 {

    /* JADX INFO: renamed from: a */
    public static final C3907m3 f15327a = new C3907m3();

    /* JADX INFO: renamed from: a */
    public static final String m18627a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ZZZZ", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String str = simpleDateFormat.format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: a */
    public static final List m18628a(File file, boolean z) {
        if (file == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && !Intrinsics.areEqual(file2.getName(), ".nomedia")) {
                    Intrinsics.checkNotNull(file2);
                    arrayList.add(file2);
                } else if (file2.isDirectory() && z) {
                    arrayList.addAll(m18628a(file2, z));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final String m18629b() {
        return "Chartboost-Android-SDK  9.11.1";
    }
}
