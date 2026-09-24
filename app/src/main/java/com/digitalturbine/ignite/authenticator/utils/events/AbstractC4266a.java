package com.digitalturbine.ignite.authenticator.utils.events;

import android.text.TextUtils;
import android.util.Pair;
import com.digitalturbine.ignite.authenticator.events.EnumC4253c;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.digitalturbine.ignite.authenticator.utils.events.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4266a {
    /* JADX INFO: renamed from: a */
    public static Object[] m20312a(Throwable th, EnumC4253c enumC4253c) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new Pair("exception_name", th.getClass().getSimpleName()));
        arrayList.add(new Pair("description", th.getMessage()));
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.getBuffer().toString();
        if (!TextUtils.isEmpty(string)) {
            arrayList.add(new Pair("stack_trace", string));
        }
        if (enumC4253c != null) {
            arrayList.add(new Pair("error_code", enumC4253c.m20299a()));
        }
        Object[] objArr = new Object[arrayList.size() * 2];
        int i = 1;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Pair pair = (Pair) arrayList.get(i3);
            objArr[i2] = pair.first;
            objArr[i] = pair.second;
            i2 += 2;
            i += 2;
        }
        return objArr;
    }
}
