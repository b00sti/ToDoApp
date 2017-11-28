package com.b00sti.todo.di

import javax.inject.Qualifier
import javax.inject.Scope

/**
 * Created by b00sti on 28.11.2017
 */
@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityContext

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class ApplicationContext

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class PerActivity

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class PreferenceInfo