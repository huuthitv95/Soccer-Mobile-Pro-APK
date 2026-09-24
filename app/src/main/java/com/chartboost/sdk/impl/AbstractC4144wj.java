package com.chartboost.sdk.impl;

import java.io.File;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.wj */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4144wj {
    /* JADX INFO: renamed from: b */
    public static final C3827if m19825b(C4078tj c4078tj, C3875kh c3875kh, C4001q8 c4001q8) {
        File fileM19134a;
        RandomAccessFile randomAccessFileM18430a;
        if (c4001q8 != null) {
            try {
                fileM19134a = c4001q8.m19134a(c4001q8.m19141b(), c4078tj.m19509d());
            } catch (Exception e) {
                C4048sb.m19411b(e.toString(), (Throwable) null, 2, (Object) null);
            }
        } else {
            fileM19134a = null;
        }
        if (fileM19134a == null || !fileM19134a.exists()) {
            File fileM18429a = c3875kh.m18429a(c4078tj.m19507b(), c4078tj.m19509d());
            randomAccessFileM18430a = fileM18429a != null ? c3875kh.m18430a(fileM18429a) : null;
        } else {
            randomAccessFileM18430a = c3875kh.m18430a(fileM19134a);
        }
        if (randomAccessFileM18430a != null) {
            return new C3827if(randomAccessFileM18430a);
        }
        return null;
    }
}
