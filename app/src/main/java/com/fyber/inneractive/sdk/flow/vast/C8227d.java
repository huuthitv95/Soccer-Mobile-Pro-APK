package com.fyber.inneractive.sdk.flow.vast;

import com.fyber.inneractive.sdk.model.vast.C8294c;
import com.fyber.inneractive.sdk.model.vast.EnumC8300i;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Comparator;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.vast.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C8227d implements Comparator {

    /* JADX INFO: renamed from: a */
    public final int f18346a;

    /* JADX INFO: renamed from: b */
    public final float f18347b;

    public C8227d(int i, int i2) {
        int i3 = i * i2;
        this.f18346a = i3;
        float f = i / i2;
        this.f18347b = f;
        IAlog.m21945a("IACompanionAdsPriorityComparator: screenWidth = %s, screenHeight = %s, mMaxArea = %s, mAspectRatio = %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f));
        IAlog.m21948d("IACompanionAdsPriorityComparator: screenWidth = %s, screenHeight = %s, mMaxArea = %s, mAspectRatio = %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f));
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        C8294c c8294c = (C8294c) obj;
        C8294c c8294c2 = (C8294c) obj2;
        int iM22021a = AbstractC9195v.m22021a(c8294c.f18522h, c8294c2.f18522h);
        if (iM22021a != 0) {
            return iM22021a;
        }
        EnumC8300i enumC8300i = c8294c.f18515a;
        EnumC8300i enumC8300i2 = EnumC8300i.Html;
        int i2 = 3;
        if (enumC8300i == enumC8300i2) {
            i = 1;
        } else if (enumC8300i == EnumC8300i.Iframe) {
            i = 2;
        } else {
            i = enumC8300i == EnumC8300i.Static ? 3 : Integer.MAX_VALUE;
        }
        EnumC8300i enumC8300i3 = c8294c2.f18515a;
        if (enumC8300i3 == enumC8300i2) {
            i2 = 1;
        } else if (enumC8300i3 == EnumC8300i.Iframe) {
            i2 = 2;
        } else if (enumC8300i3 != EnumC8300i.Static) {
            i2 = Integer.MAX_VALUE;
        }
        int iM22021a2 = AbstractC9195v.m22021a(i, i2);
        if (iM22021a2 != 0) {
            return iM22021a2;
        }
        int iCompare = Float.compare(Math.abs((c8294c.f18517c / c8294c.f18518d) - this.f18347b), Math.abs((c8294c2.f18517c / c8294c2.f18518d) - this.f18347b));
        if (iCompare != 0) {
            return iCompare;
        }
        return AbstractC9195v.m22021a(Math.abs((c8294c.f18517c * c8294c.f18518d) - this.f18346a), Math.abs((c8294c2.f18517c * c8294c2.f18518d) - this.f18346a));
    }
}
