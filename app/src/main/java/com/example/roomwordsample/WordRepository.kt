package com.example.roomwordsample


class WordRepository(private val wordDao: WordDao) {
        val allWords: Flow<List<Word>> = wordDao.getAlphabetizedWords()

        @Suppress("RedundantSuspendModifier")
        @WorkerThread
        suspend fun insert(word: Word) {
            wordDao.insert(word)
        }
    }