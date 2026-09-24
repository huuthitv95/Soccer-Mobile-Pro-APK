package kotlinx.coroutines;

import com.ironsource.C11391D1;
import kotlin.Metadata;
import kotlinx.coroutines.internal.Segment;

/* JADX INFO: compiled from: Waiter.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m43475d2 = {"Lkotlinx/coroutines/Waiter;", "", "invokeOnCancellation", "", C11391D1.f24199i, "Lkotlinx/coroutines/internal/Segment;", "index", "", "kotlinx-coroutines-core"}, m43476k = 1, m43477mv = {1, 9, 0}, m43479xi = 48)
public interface Waiter {
    void invokeOnCancellation(Segment<?> segment, int index);
}
