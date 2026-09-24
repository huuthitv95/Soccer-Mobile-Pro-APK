package com.ironsource;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.ironsource.db */
/* JADX INFO: loaded from: classes6.dex */
public final class C12151db {

    /* JADX INFO: renamed from: a */
    private final String f30245a;

    /* JADX INFO: renamed from: b */
    private final int f30246b;

    public C12151db(String str, int i) {
        this.f30245a = str;
        this.f30246b = i;
    }

    /* JADX INFO: renamed from: b */
    private final String m31309b() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        String strM31308a = m31308a(stackTrace, 4);
        String strM31310b = m31310b(stackTrace, 4);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s %s", Arrays.copyOf(new Object[]{strM31308a, strM31310b}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    /* JADX INFO: renamed from: a */
    public final int m31311a() {
        return this.f30246b;
    }

    /* JADX INFO: renamed from: c */
    public final String m31312c() {
        String str = this.f30245a;
        if (str == null || str.length() == 0) {
            return m31309b();
        }
        return m31309b() + " - " + this.f30245a;
    }

    /* JADX INFO: renamed from: a */
    private final String m31308a(StackTraceElement[] stackTraceElementArr, int i) {
        List listEmptyList;
        List listEmptyList2;
        if (stackTraceElementArr.length <= i) {
            return "";
        }
        String className = stackTraceElementArr[i].getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "stackTrace[depth]\n              .className");
        List<String> listSplit = new Regex("\\.").split(className, 0);
        if (!listSplit.isEmpty()) {
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listEmptyList = CollectionsKt.emptyList();
                    break;
                }
                if (listIterator.previous().length() != 0) {
                    listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
            break;
        }
        String[] strArr = (String[]) listEmptyList.toArray(new String[0]);
        String str = strArr[strArr.length - 1];
        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) "$", false, 2, (Object) null)) {
            return str;
        }
        List<String> listSplit2 = new Regex("\\$").split(str, 0);
        if (listSplit2.isEmpty()) {
            listEmptyList2 = CollectionsKt.emptyList();
        } else {
            ListIterator<String> listIterator2 = listSplit2.listIterator(listSplit2.size());
            while (listIterator2.hasPrevious()) {
                if (listIterator2.previous().length() != 0) {
                    listEmptyList2 = CollectionsKt.take(listSplit2, listIterator2.nextIndex() + 1);
                }
            }
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return ((String[]) listEmptyList2.toArray(new String[0]))[0];
    }

    /* JADX INFO: renamed from: b */
    private final String m31310b(StackTraceElement[] stackTraceElementArr, int i) {
        List listEmptyList;
        int i2;
        List listEmptyList2;
        List listEmptyList3;
        if (stackTraceElementArr.length > i) {
            String className = stackTraceElementArr[i].getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "stackTrace[depth]\n              .className");
            List<String> listSplit = new Regex("\\.").split(className, 0);
            if (!listSplit.isEmpty()) {
                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                            break;
                        }
                    } else {
                        listEmptyList = CollectionsKt.emptyList();
                        break;
                    }
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
                break;
            }
            String[] strArr = (String[]) listEmptyList.toArray(new String[0]);
            String str = strArr[strArr.length - 1];
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "$", false, 2, (Object) null)) {
                List<String> listSplit2 = new Regex("\\$").split(str, 0);
                if (!listSplit2.isEmpty()) {
                    ListIterator<String> listIterator2 = listSplit2.listIterator(listSplit2.size());
                    while (listIterator2.hasPrevious()) {
                        if (listIterator2.previous().length() != 0) {
                            listEmptyList3 = CollectionsKt.take(listSplit2, listIterator2.nextIndex() + 1);
                        }
                    }
                    listEmptyList3 = CollectionsKt.emptyList();
                } else {
                    listEmptyList3 = CollectionsKt.emptyList();
                }
                return ((String[]) listEmptyList3.toArray(new String[0]))[1] + "." + stackTraceElementArr[i].getMethodName();
            }
            String methodName = stackTraceElementArr[i].getMethodName();
            Intrinsics.checkNotNullExpressionValue(methodName, "stackTrace[depth].methodName");
            if (StringsKt.contains$default((CharSequence) methodName, (CharSequence) "$", false, 2, (Object) null) && stackTraceElementArr.length > (i2 = i + 1)) {
                String className2 = stackTraceElementArr[i2].getClassName();
                Intrinsics.checkNotNullExpressionValue(className2, "stackTrace[depth + 1]\n                .className");
                List<String> listSplit3 = new Regex("\\$").split(className2, 0);
                if (!listSplit3.isEmpty()) {
                    ListIterator<String> listIterator3 = listSplit3.listIterator(listSplit3.size());
                    while (true) {
                        if (listIterator3.hasPrevious()) {
                            if (listIterator3.previous().length() != 0) {
                                listEmptyList2 = CollectionsKt.take(listSplit3, listIterator3.nextIndex() + 1);
                                break;
                            }
                        } else {
                            listEmptyList2 = CollectionsKt.emptyList();
                            break;
                        }
                    }
                } else {
                    listEmptyList2 = CollectionsKt.emptyList();
                    break;
                }
                String[] strArr2 = (String[]) listEmptyList2.toArray(new String[0]);
                if (strArr2.length > 1) {
                    return strArr2[1] + "." + stackTraceElementArr[i2].getMethodName();
                }
                String methodName2 = stackTraceElementArr[i2].getMethodName();
                Intrinsics.checkNotNullExpressionValue(methodName2, "{\n              stackTra….methodName\n            }");
                return methodName2;
            }
            String methodName3 = stackTraceElementArr[i].getMethodName();
            Intrinsics.checkNotNullExpressionValue(methodName3, "stackTrace[depth].methodName");
            return methodName3;
        }
        return "";
    }
}
