import java.util.*;
import java.lang.*;

class Main{

// Function to generate all primes

static ArrayList<Integer> SieveOfEratosthenes(int n)
{
	boolean[] prime = new boolean[2 * n + 1];
	Arrays.fill(prime, true);

	for(int p = 2; p * p <= 2 * n; p++)
	{
		
		// If p is a prime
		if (prime[p] == true)
		{
			
			// Mark all its multiples
			// as non-prime
			for(int i = p * p;
					i <= 2 * n; i += p)
				prime[i] = false;
		}
	}
	
	ArrayList<Integer> primes = new ArrayList<>();

	// Store all prime numbers
	for(int p = 2; p <= 2 * n; p++)
		if (prime[p])
			primes.add(p);

	// Return the list of primes
	return primes;
}

// Function to calculate the
// minimum increments to
// convert every array elements
// to a prime
static int minChanges(int[] arr)
{
	int n = arr.length;
	int ans = 0;

	// Extract maximum element
	// of the given array
	int maxi = arr[0];
	for(int i = 1; i < arr.length; i++)
		maxi = Math.max(maxi, arr[i]);
		
	ArrayList<Integer> primes = SieveOfEratosthenes(maxi);

	for(int i = 0; i < n; i++)
	{
		
		// Extract the index which has
		// the next greater prime
		int x = -1;
		for(int j = 0; j < primes.size(); j++)
		{
			if (arr[i] == primes.get(j))
			{
				x = j;
				break;
			}
			else if (arr[i] < primes.get(j))
			{
				x = j;
				break;
			}
		}
		
		// Store the difference
		// between the prime and
		// the array element
		int minm = Math.abs(primes.get(x) - arr[i]);
	
		if (x > 1)
		{
			minm = Math.min(minm,
							Math.abs(primes.get(x - 1) -
									arr[i]));
		}
		ans += minm;
	}
	return ans;
}

// Driver code
public static void main (String[] args)
{
	int[] arr = { 4, 25, 13, 6, 20 };
	
	System.out.println(minChanges(arr));
}
}

