require "prime"

module Euler
  refine Numeric do
    def factors
      (1..Math.sqrt(self).to_i).select { |i| self % i == 0 }
    end

    def prime_factors
      factors.select { |i| Prime.prime? i }
    end
  end
end

using Euler

puts 600_851_475_143.prime_factors.max
