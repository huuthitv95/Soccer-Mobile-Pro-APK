package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.i */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8382i {
    /* JADX INFO: renamed from: a */
    public static C8391l m20757a(FilterInputStream filterInputStream, int i, String str, Map map, String str2) throws C8359b, C8408q1 {
        try {
            C8391l c8391l = new C8391l(filterInputStream, i, str, map, str2);
            if (c8391l.f18666a / 100 != 5) {
                return c8391l;
            }
            throw new C8359b(String.format("server returned error %d", Integer.valueOf(c8391l.f18666a)));
        } catch (C8359b e) {
            IAlog.m21945a("failed executing network request msg: %s", e.getMessage());
            throw new C8359b(e);
        } catch (Exception e2) {
            IAlog.m21945a("failed reading network response msg: %s", e2.getMessage());
            throw new C8408q1(e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static FilterInputStream m20758a(InputStream inputStream, boolean z) {
        try {
            if (z) {
                IAlog.m21945a("HttpExecutorBase: getInputStream found gzip encoding", new Object[0]);
                return new GZIPInputStream(inputStream);
            }
            IAlog.m21945a("HttpExecutorBase: getInputStream no gzip encoding", new Object[0]);
            return new BufferedInputStream(inputStream);
        } catch (Exception unused) {
            return null;
        }
    }
}
