def word_count(text):
    words = text.lower().split()
    word_counts = {}
    
    for word in words:
        word_counts[word] = word_counts.get(word, 0) + 1

    return word_counts


text = "This is a test. This test is only a test."
result = word_count(text)
print(result)