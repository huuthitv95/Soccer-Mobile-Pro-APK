package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzidj {
    static zzidb zzb(Class cls) {
        ClassLoader classLoader = zzidj.class.getClassLoader();
        if (cls.equals(zzidb.class)) {
            try {
                try {
                    return (zzidb) cls.cast(((zzidj) Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null)).zza());
                } catch (ReflectiveOperationException e) {
                    throw new IllegalStateException(e);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        Iterator it = ServiceLoader.load(zzidj.class, classLoader).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            try {
                arrayList.add((zzidb) cls.cast(((zzidj) it.next()).zza()));
            } catch (ServiceConfigurationError e2) {
                Logger logger = Logger.getLogger(zzicw.class.getName());
                Level level = Level.SEVERE;
                String simpleName = cls.getSimpleName();
                String.valueOf(simpleName);
                logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(String.valueOf(simpleName)), (Throwable) e2);
            }
        }
        if (arrayList.size() == 1) {
            return (zzidb) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (zzidb) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
        } catch (ReflectiveOperationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    protected abstract zzidb zza();
}
