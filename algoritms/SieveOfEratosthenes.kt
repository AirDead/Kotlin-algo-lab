fun sieveOfEratosthenes(n: Int): BooleanArray {
    val prime = BooleanArray(n + 1) { true }

    prime[0] = false
    prime[1] = false

    var p = 2
    while (p * p <= n) {
        if (prime[p]) {
            var i = p * p
            while (i <= n) {
                prime[i] = false
                i += p
            }
        }
        p++
    }

    return prime
}
