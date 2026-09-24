package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: ConsistentCopyVisibility.kt */
/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.TYPE})
@Metadata(m43474d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m43475d2 = {"Lkotlin/ExposedCopyVisibility;", "", "kotlin-stdlib"}, m43476k = 1, m43477mv = {2, 1, 0}, m43479xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface ExposedCopyVisibility {
}
