import react from '@vitejs/plugin-react';
import {defineConfig} from 'vite';

export default defineConfig({
	build: {
		cssCodeSplit: false,
		outDir: 'build/static',
		rollupOptions: {
			output: {
				entryFileNames: 'index.[hash].js',
			},
		},
	},
	define: {
		'process.env.NODE_ENV': JSON.stringify('production'),
	},
	plugins: [react()],
});
