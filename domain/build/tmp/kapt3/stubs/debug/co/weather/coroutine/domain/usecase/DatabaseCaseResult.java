package co.weather.coroutine.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lco/weather/coroutine/domain/usecase/DatabaseCaseResult;", "T", "", "()V", "Error", "GenericError", "Success", "Lco/weather/coroutine/domain/usecase/DatabaseCaseResult$Success;", "Lco/weather/coroutine/domain/usecase/DatabaseCaseResult$GenericError;", "Lco/weather/coroutine/domain/usecase/DatabaseCaseResult$Error;", "domain_debug"})
public abstract class DatabaseCaseResult<T extends java.lang.Object> {
    
    private DatabaseCaseResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lco/weather/coroutine/domain/usecase/DatabaseCaseResult$Success;", "T", "", "Lco/weather/coroutine/domain/usecase/DatabaseCaseResult;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "domain_debug"})
    public static final class Success<T extends java.lang.Object> extends co.weather.coroutine.domain.usecase.DatabaseCaseResult<T> {
        @org.jetbrains.annotations.NotNull()
        private final T data = null;
        
        public Success(@org.jetbrains.annotations.NotNull()
        T data) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final T getData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0006H\u00c6\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lco/weather/coroutine/domain/usecase/DatabaseCaseResult$GenericError;", "Lco/weather/coroutine/domain/usecase/DatabaseCaseResult;", "", "code", "", "error", "Lco/weather/coroutine/domain/model/ErrorsResponse;", "(Ljava/lang/Integer;Lco/weather/coroutine/domain/model/ErrorsResponse;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getError", "()Lco/weather/coroutine/domain/model/ErrorsResponse;", "component1", "component2", "copy", "(Ljava/lang/Integer;Lco/weather/coroutine/domain/model/ErrorsResponse;)Lco/weather/coroutine/domain/usecase/DatabaseCaseResult$GenericError;", "equals", "", "other", "", "hashCode", "toString", "", "domain_debug"})
    public static final class GenericError extends co.weather.coroutine.domain.usecase.DatabaseCaseResult {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer code = null;
        @org.jetbrains.annotations.NotNull()
        private final co.weather.coroutine.domain.model.ErrorsResponse error = null;
        
        @org.jetbrains.annotations.NotNull()
        public final co.weather.coroutine.domain.usecase.DatabaseCaseResult.GenericError copy(@org.jetbrains.annotations.Nullable()
        java.lang.Integer code, @org.jetbrains.annotations.NotNull()
        co.weather.coroutine.domain.model.ErrorsResponse error) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public GenericError(@org.jetbrains.annotations.Nullable()
        java.lang.Integer code, @org.jetbrains.annotations.NotNull()
        co.weather.coroutine.domain.model.ErrorsResponse error) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final co.weather.coroutine.domain.model.ErrorsResponse component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final co.weather.coroutine.domain.model.ErrorsResponse getError() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lco/weather/coroutine/domain/usecase/DatabaseCaseResult$Error;", "Lco/weather/coroutine/domain/usecase/DatabaseCaseResult;", "", "exception", "", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "domain_debug"})
    public static final class Error extends co.weather.coroutine.domain.usecase.DatabaseCaseResult {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Throwable exception = null;
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable exception) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable getException() {
            return null;
        }
    }
}