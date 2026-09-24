package com.unity3d.services.core.p295di;

import com.ironsource.C12434q2;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: IServicesRegistry.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH&¢\u0006\u0002\u0010\u000eJ\u001b\u0010\u000f\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0010\u001a\u00020\u0004H&¢\u0006\u0002\u0010\u0011J\u001d\u0010\u0012\u001a\u0004\u0018\u0001H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0010\u001a\u00020\u0004H&¢\u0006\u0002\u0010\u0011J$\u0010\u0013\u001a\u00020\u0014\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0010\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\u0005H&R\"\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m43475d2 = {"Lcom/unity3d/services/core/di/IServicesRegistry;", "", "services", "", "Lcom/unity3d/services/core/di/ServiceKey;", "Lkotlin/Lazy;", "getServices", "()Ljava/util/Map;", "getService", "T", "named", "", C12434q2.f31744p, "Lkotlin/reflect/KClass;", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "resolveService", "key", "(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;", "resolveServiceOrNull", "updateService", "", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public interface IServicesRegistry {

    /* JADX INFO: compiled from: IServicesRegistry.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getService$default(IServicesRegistry iServicesRegistry, String str, KClass kClass, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getService");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            return iServicesRegistry.getService(str, kClass);
        }
    }

    <T> T getService(String named, KClass<?> instance);

    Map<ServiceKey, Lazy<?>> getServices();

    <T> T resolveService(ServiceKey key);

    <T> T resolveServiceOrNull(ServiceKey key);

    <T> void updateService(ServiceKey key, Lazy<? extends T> instance);
}
