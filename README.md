# Kotlin ConcurrentModificationException Example

This repository demonstrates a common error in Kotlin involving `ConcurrentModificationException` when modifying a list while iterating over it using a `for` loop.  The example shows both the unsafe approach and the safe alternative using `removeIf`.  This is a subtle bug that can be difficult to track down.