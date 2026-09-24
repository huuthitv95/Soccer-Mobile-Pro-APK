package com.unity3d.ads.core.domain.billing;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProductDetailsFetcherWithFallback.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcherWithFallback;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "primaryFetcher", "secondaryFetcher", "(Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;)V", "fetchProductDetails", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", InAppPurchaseMetaData.KEY_PRODUCT_ID, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class ProductDetailsFetcherWithFallback implements ProductDetailsFetcher {
    private final ProductDetailsFetcher primaryFetcher;
    private final ProductDetailsFetcher secondaryFetcher;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1 */
    /* JADX INFO: compiled from: ProductDetailsFetcherWithFallback.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback", m43504f = "ProductDetailsFetcherWithFallback.kt", m43505i = {0, 0, 2}, m43506l = {16, 20, 24}, m43507m = "fetchProductDetails", m43508n = {"this", InAppPurchaseMetaData.KEY_PRODUCT_ID, "primaryResult"}, m43509s = {"L$0", "L$1", "L$0"})
    static final class C145531 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C145531(Continuation<? super C145531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProductDetailsFetcherWithFallback.this.fetchProductDetails(null, this);
        }
    }

    public ProductDetailsFetcherWithFallback(ProductDetailsFetcher primaryFetcher, ProductDetailsFetcher secondaryFetcher) {
        Intrinsics.checkNotNullParameter(primaryFetcher, "primaryFetcher");
        Intrinsics.checkNotNullParameter(secondaryFetcher, "secondaryFetcher");
        this.primaryFetcher = primaryFetcher;
        this.secondaryFetcher = secondaryFetcher;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    public Object fetchProductDetails(String str, Continuation<? super ProductDetailsResult> continuation) throws Throwable {
        C145531 c145531;
        ProductDetailsFetcherWithFallback productDetailsFetcherWithFallback;
        ProductDetailsResult productDetailsResult;
        ProductDetailsResult productDetailsResult2;
        if (continuation instanceof C145531) {
            c145531 = (C145531) continuation;
            if ((c145531.label & Integer.MIN_VALUE) != 0) {
                c145531.label -= Integer.MIN_VALUE;
            } else {
                c145531 = new C145531(continuation);
            }
        } else {
            c145531 = new C145531(continuation);
        }
        Object objFetchProductDetails = c145531.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c145531.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objFetchProductDetails);
            ProductDetailsFetcher productDetailsFetcher = this.primaryFetcher;
            c145531.L$0 = this;
            c145531.L$1 = str;
            c145531.label = 1;
            objFetchProductDetails = productDetailsFetcher.fetchProductDetails(str, c145531);
            if (objFetchProductDetails != coroutine_suspended) {
                productDetailsFetcherWithFallback = this;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            str = (String) c145531.L$1;
            productDetailsFetcherWithFallback = (ProductDetailsFetcherWithFallback) c145531.L$0;
            ResultKt.throwOnFailure(objFetchProductDetails);
        } else {
            if (i == 2) {
                ResultKt.throwOnFailure(objFetchProductDetails);
                return objFetchProductDetails;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            productDetailsResult = (ProductDetailsResult) c145531.L$0;
            ResultKt.throwOnFailure(objFetchProductDetails);
        }
        productDetailsResult2 = (ProductDetailsResult) objFetchProductDetails;
        if (productDetailsResult2 instanceof ProductDetailsResult.Success) {
            return productDetailsResult2;
        }
        return productDetailsResult;
        ProductDetailsResult productDetailsResult3 = (ProductDetailsResult) objFetchProductDetails;
        if (productDetailsResult3 instanceof ProductDetailsResult.Success) {
            return productDetailsResult3;
        }
        if (productDetailsResult3 instanceof ProductDetailsResult.NotFound) {
            ProductDetailsFetcher productDetailsFetcher2 = productDetailsFetcherWithFallback.secondaryFetcher;
            c145531.L$0 = null;
            c145531.L$1 = null;
            c145531.label = 2;
            Object objFetchProductDetails2 = productDetailsFetcher2.fetchProductDetails(str, c145531);
            if (objFetchProductDetails2 != coroutine_suspended) {
                return objFetchProductDetails2;
            }
        } else {
            if (!(productDetailsResult3 instanceof ProductDetailsResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            ProductDetailsFetcher productDetailsFetcher3 = productDetailsFetcherWithFallback.secondaryFetcher;
            c145531.L$0 = productDetailsResult3;
            c145531.L$1 = null;
            c145531.label = 3;
            Object objFetchProductDetails3 = productDetailsFetcher3.fetchProductDetails(str, c145531);
            if (objFetchProductDetails3 != coroutine_suspended) {
                objFetchProductDetails = objFetchProductDetails3;
                productDetailsResult = productDetailsResult3;
                productDetailsResult2 = (ProductDetailsResult) objFetchProductDetails;
                if (productDetailsResult2 instanceof ProductDetailsResult.Success) {
                    return productDetailsResult2;
                }
                return productDetailsResult;
            }
        }
        return coroutine_suspended;
    }
}
