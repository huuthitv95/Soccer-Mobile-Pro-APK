package com.ironsource.adqualitysdk.sdk.p286i;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.dx */
/* JADX INFO: loaded from: classes6.dex */
public final class C11913dx extends AbstractC11919ec {

    /* JADX INFO: renamed from: ﻛ */
    private static int f28737 = 0;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28739 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private AbstractC11919ec[] f28741;

    /* JADX INFO: renamed from: ﾒ */
    private static char[] f28740 = {33944, AbstractJsonLexerKt.END_LIST};

    /* JADX INFO: renamed from: ｋ */
    private static long f28738 = -169319086672529191L;

    public C11913dx(List<AbstractC11919ec> list, C11904do c11904do) {
        super(c11904do);
        AbstractC11919ec[] abstractC11919ecArr = new AbstractC11919ec[list.size()];
        this.f28741 = abstractC11919ecArr;
        list.toArray(abstractC11919ecArr);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11919ec
    /* JADX INFO: renamed from: ﾇ */
    public final C11908ds mo30123(C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        AbstractC11919ec[] abstractC11919ecArr = this.f28741;
        int i2 = f28737 + 29;
        f28739 = i2 % 128;
        int i3 = i2 % 2;
        for (AbstractC11919ec abstractC11919ec : abstractC11919ecArr) {
            int i4 = f28737 + 35;
            f28739 = i4 % 128;
            int i5 = i4 % 2;
            arrayList.add(abstractC11919ec.m30156(c11907dr, c11877co).m30066());
        }
        return new C11908ds(arrayList);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m30141(KeyEvent.getMaxKeyCode() >> 16, (char) (34035 - AndroidCharacter.getMirror('0')), 1 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
        sb.append(m30152(this.f28741));
        sb.append(m30141(1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0') + 1), (KeyEvent.getMaxKeyCode() >> 16) + 1).intern());
        String string = sb.toString();
        int i2 = f28739 + 59;
        f28737 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f28737 + 7;
        f28739 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        boolean zEquals = Arrays.equals(this.f28741, ((C11913dx) obj).f28741);
        int i3 = f28739 + 105;
        f28737 = i3 % 128;
        if (i3 % 2 == 0) {
            return zEquals;
        }
        super.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f28739 + 17;
        f28737 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Arrays.hashCode(this.f28741);
        int i4 = f28739 + 69;
        f28737 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30141(int i, char c, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f28740[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f28738)) ^ ((long) c));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
