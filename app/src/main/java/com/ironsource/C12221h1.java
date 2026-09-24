package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.h1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12221h1 {

    /* JADX INFO: renamed from: b */
    public static final a f30453b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final int f30454c = -1;

    /* JADX INFO: renamed from: a */
    private final C12313m0 f30455a;

    /* JADX INFO: renamed from: com.ironsource.h1$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h1$b */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((LevelPlayAdSize) t2).getWidth()), Integer.valueOf(((LevelPlayAdSize) t).getWidth()));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h1$c */
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Comparator f30456a;

        public c(Comparator comparator) {
            this.f30456a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.f30456a.compare(t, t2);
            return iCompare != 0 ? iCompare : ComparisonsKt.compareValues(Integer.valueOf(((LevelPlayAdSize) t2).getHeight()), Integer.valueOf(((LevelPlayAdSize) t).getHeight()));
        }
    }

    public C12221h1(C12313m0 adSizeTools) {
        Intrinsics.checkNotNullParameter(adSizeTools, "adSizeTools");
        this.f30455a = adSizeTools;
    }

    /* JADX INFO: renamed from: a */
    public final LevelPlayAdSize m31579a(Context context, Integer num) {
        LevelPlayAdSize levelPlayAdSizeCreateCustomSize;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f30455a.m32124d()) {
            IronLog.API.error(C12313m0.m32116a(this.f30455a, "The SDK must be successfully initialized to create an Adaptive Ad Size", (String) null, 2, (Object) null));
            return null;
        }
        Integer numM32122b = this.f30455a.m32122b(context);
        if (numM32122b == null) {
            IronLog.API.error(C12313m0.m32116a(this.f30455a, "Error getting max current orientation banner height", (String) null, 2, (Object) null));
            return null;
        }
        int iIntValue = numM32122b.intValue();
        int iM31576a = m31576a(num, context);
        int iM32119a = this.f30455a.m32119a(iM31576a);
        List<LevelPlayAdSize> listM31577a = m31577a();
        Iterator<T> it = m31578a(listM31577a, iIntValue, iM31576a).iterator();
        while (true) {
            if (!it.hasNext()) {
                levelPlayAdSizeCreateCustomSize = null;
                break;
            }
            levelPlayAdSizeCreateCustomSize = (LevelPlayAdSize) it.next();
            if (levelPlayAdSizeCreateCustomSize.getWidth() <= iM31576a && (levelPlayAdSizeCreateCustomSize.getHeight() <= iM32119a || iM32119a == -1)) {
                iM32119a = Math.max(iM32119a, levelPlayAdSizeCreateCustomSize.getHeight());
                break;
            }
        }
        if (levelPlayAdSizeCreateCustomSize == null) {
            iM32119a = ((LevelPlayAdSize) CollectionsKt.last((List) listM31577a)).getHeight();
            levelPlayAdSizeCreateCustomSize = LevelPlayAdSize.Companion.createCustomSize(iM31576a, iM32119a);
        }
        int i = iM32119a;
        LevelPlayAdSize levelPlayAdSize = levelPlayAdSizeCreateCustomSize;
        IronLog.INTERNAL.info(C12313m0.m32116a(this.f30455a, "Adaptive: " + iM31576a + "x" + i + " Fallback: " + levelPlayAdSize, (String) null, 2, (Object) null));
        return new LevelPlayAdSize(iM31576a, i, "CUSTOM", true, levelPlayAdSize);
    }

    /* JADX INFO: renamed from: a */
    private final int m31576a(Integer num, Context context) {
        if (num != null && num.intValue() < 0) {
            IronLog.API.info(C12313m0.m32116a(this.f30455a, "Width is invalid, screen width will be used", (String) null, 2, (Object) null));
            return C11762Y4.f26580a.m28009b(context);
        }
        if (num == null) {
            return C11762Y4.f26580a.m28009b(context);
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: a */
    private final List<LevelPlayAdSize> m31577a() {
        return CollectionsKt.sortedWith(this.f30455a.m32123b(), new c(new b()));
    }

    /* JADX INFO: renamed from: a */
    private final List<LevelPlayAdSize> m31578a(List<LevelPlayAdSize> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
            if (levelPlayAdSize.getHeight() <= i && levelPlayAdSize.getWidth() <= i2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
