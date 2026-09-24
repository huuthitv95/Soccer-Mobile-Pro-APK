package com.chartboost.sdk.impl;

import com.ironsource.sdk.controller.InterfaceC12497f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.l5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3886l5 {

    /* JADX INFO: renamed from: a */
    public static final C3886l5 f15193a = new C3886l5();

    /* JADX INFO: renamed from: a */
    public final AbstractC3863k5 m18486a(Element element, C3923mj context) {
        List listEmptyList;
        List listM18696d;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        C3925ml c3925ml = C3925ml.f15411a;
        String strM18694b = c3925ml.m18694b(element, "id");
        String strM18694b2 = c3925ml.m18694b(element, "AdID");
        if (strM18694b2 == null) {
            strM18694b2 = c3925ml.m18694b(element, InterfaceC12497f.b.f32089c);
        }
        String str = strM18694b2;
        String strM18694b3 = c3925ml.m18694b(element, "sequence");
        Integer intOrNull = strM18694b3 != null ? StringsKt.toIntOrNull(strM18694b3) : null;
        List listM19218b = C4011qi.f16008a.m19218b(element);
        Element elementM18695c = c3925ml.m18695c(element, "CreativeExtensions");
        if (elementM18695c == null || (listM18696d = c3925ml.m18696d(elementM18695c, "CreativeExtension")) == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM18696d, 10));
            Iterator it = listM18696d.iterator();
            while (it.hasNext()) {
                listEmptyList.add(C3932n5.f15476a.m18765a((Element) it.next()));
            }
        }
        List list = listEmptyList;
        C3925ml c3925ml2 = C3925ml.f15411a;
        Element elementM18695c2 = c3925ml2.m18695c(element, "Linear");
        if (elementM18695c2 != null) {
            return new AbstractC3863k5.b(strM18694b, str, intOrNull, listM19218b, C3915mb.f15344a.m18636a(elementM18695c2, context), list);
        }
        Element elementM18695c3 = c3925ml2.m18695c(element, "CompanionAds");
        if (elementM18695c3 != null) {
            return new AbstractC3863k5.a(strM18694b, str, intOrNull, listM19218b, C4107v4.f16539a.m19647b(elementM18695c3, context), list);
        }
        c3925ml2.m18695c(element, "NonLinearAds");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Object m18487b(Element creativesParentElement, C3923mj context) {
        AbstractC3863k5 abstractC3863k5M18486a;
        Intrinsics.checkNotNullParameter(creativesParentElement, "creativesParentElement");
        Intrinsics.checkNotNullParameter(context, "context");
        List listM18696d = C3925ml.f15411a.m18696d(creativesParentElement, "Creative");
        ArrayList arrayList = new ArrayList();
        Iterator it = listM18696d.iterator();
        while (it.hasNext()) {
            try {
                abstractC3863k5M18486a = f15193a.m18486a((Element) it.next(), context);
            } catch (Exception e) {
                C4048sb.m19410b("Failed to parse Creative element: " + e.getMessage(), e);
                abstractC3863k5M18486a = null;
            }
            if (abstractC3863k5M18486a != null) {
                arrayList.add(abstractC3863k5M18486a);
            }
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m44946constructorimpl(arrayList);
    }
}
