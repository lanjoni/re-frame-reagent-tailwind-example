/** @type {import('tailwindcss').Config} */
module.exports = {
  mode: 'jit',
  content: [
    './resources/public/js/compiled/app.js',
    './resources/public/css/index.css',
    './src/example/**/*.cljs'
  ],
  plugins: [],
}
